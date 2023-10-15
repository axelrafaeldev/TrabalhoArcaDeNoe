package estudantes.entidades;

import professor.entidades.Andar;
import professor.entidades.Elevador;
import professor.entidades.Arca;
import java.util.List;

public class Ascensorista {

    public Ascensorista() {
        
    }

    /**
     * Realiza ações de controle no elevador com base nas condições do andar.
     *
     * @param elevador O elevador a ser controlado.
     * @param andar    O andar com informações para controle.
     */
    public void agir(Elevador elevador, Andar andar) {
        // Controle da temperatura do ar-condicionado
        controlarTemperatura(elevador, andar);

        // Controle do alagamento do elevador
        controlarAlagamento(elevador, andar);

        // Controle do peso máximo
        controlarPeso(elevador);

        // Controle de embarque e desembarque
        controlarEmbarqueDesembarque(elevador, andar);

        // Atualizar o estado do elevador (subir ou descer)
        controlarMovimentoElevador(elevador, andar);
    }

    private void controlarTemperatura(Elevador elevador, Andar andar) {
        try {
            double temperaturaDesejada = andar.getTemperaturaDoArCondicionado();
            int temperaturaAtual = elevador.getTemperaturaDoArCondicionado();
            if (temperaturaAtual < temperaturaDesejada - 15) {
                elevador.setTemperaturaDoArCondicionado((int) (temperaturaDesejada - 15));
                System.out.println("A temperatura do ar-condicionado foi ajustada para esfriar o elevador.");
            } else if (temperaturaAtual > temperaturaDesejada + 15) {
                elevador.setTemperaturaDoArCondicionado((int) (temperaturaDesejada + 15));
                System.out.println("A temperatura do ar-condicionado foi ajustada para aquecer o elevador.");
            } else {
                System.out.println("A temperatura do ar-condicionado está dentro da faixa aceitável.");
            }
        } catch (RuntimeException e) {
            System.err.println("Erro ao ajustar a temperatura do ar-condicionado: " + e.getMessage());
        }
    }
    
    private void controlarAlagamento(Elevador elevador, Andar andar) {
        try {
            boolean nivelAgua = andar.getNivelAgua() > 0;
            if (nivelAgua && !elevador.isCheioDeAgua()) {
                elevador.encher();
                System.out.println("O elevador foi enchido de água devido ao nível de água alto no andar.");
            } else if (!nivelAgua && elevador.isCheioDeAgua()) {
                elevador.drenar();
                System.out.println("A água foi drenada do elevador devido à diminuição do nível de água no andar.");
            } else {
                System.out.println("O elevador não está cheio de água, e o nível de água no andar é aceitável.");
            }
        } catch (RuntimeException e) {
            System.err.println("Erro ao controlar o alagamento do elevador: " + e.getMessage());
        }
    }
    

    private void controlarPeso(Elevador elevador) {
        try {
            double pesoMaximo = elevador.getLimiteDePeso();
            double pesoAtual = elevador.calcularPesoAnimais();
            if (pesoAtual > pesoMaximo) {
                // Remover animais com base no peso
                List<Animal> animaisNoElevador = elevador.checarAnimaisNoElevador();
                double pesoRemovido = 0;
                int i = 0;
                while (pesoAtual > pesoMaximo && i < animaisNoElevador.size()) {
                    Animal animalARemover = animaisNoElevador.get(i);
                    if (pesoRemovido + animalARemover.getPeso() <= pesoAtual - pesoMaximo) {
                        elevador.desembarcar(animalARemover, andar);
                        pesoRemovido += animalARemover.getPeso();
                    }
                    i++;
                }
                System.out.println("Animais removidos para aliviar o peso no elevador.");
            } else {
                System.out.println("O peso no elevador está dentro do limite aceitável.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao controlar o peso do elevador: " + e.getMessage());
        }
    }

    private void controlarEmbarqueDesembarque(Elevador elevador, Andar andar) {
        controlarEmbarque(elevador, andar);
        controlarDesembarque(elevador, andar);
    }

    private void controlarEmbarque(Elevador elevador, Andar andar) {
        List<Animal> animaisNoAndar = andar.getAnimaisNoAndar();
        for (Animal animal : animaisNoAndar) {
            try {
                if (elevador.podeEmbarcar(animal) && !elevador.isCheio()) {
                    elevador.embarcar(animal);
                    System.out.println("Um animal embarcou no elevador.");
                }
            } catch (IllegalStateException e) {
                System.err.println("Erro ao embarcar animal no elevador: " + e.getMessage());
            }
        }
    }

    private void controlarDesembarque(Elevador elevador, Andar andar) {
        List<Animal> animaisNoElevador = elevador.checarAnimaisNoElevador();
        for (Animal animal : animaisNoElevador) {
            if (andar.desembarcar(animal)) {
                try {
                    elevador.desembarcar(animal, andar);
                    System.out.println("Um animal desembarcou do elevador.");
                } catch (IllegalStateException e) {
                    System.err.println("Erro ao desembarcar animal do elevador: " + e.getMessage());
                }
            }
        }
    }

    private void controlarMovimentoElevador(Elevador elevador, Andar andar) {
        int andarAtual = elevador.getAndarAtual();
        int destinoAndar = andar.getNumeroAndar();

        if (andarAtual < destinoAndar) {
            if (elevador.podeSubir()) {
                elevador.subir();
                System.out.println("O elevador está subindo para o andar de destino.");
            } else {
                System.out.println("O elevador já está no andar mais alto possível.");
            }
        } else if (andarAtual > destinoAndar) {
            if (elevador.podeDescer()) {
                elevador.descer();
                System.out.println("O elevador está descendo para o andar de destino.");
            } else {
                System.out.println("O elevador já está no andar mais baixo possível.");
            }
        } else {
            System.out.println("O elevador já está no andar de destino.");
        }
    }
}
