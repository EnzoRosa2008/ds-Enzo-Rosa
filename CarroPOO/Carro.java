public class Carro {
    
    // Atributos (características do carro)
    String modelo;
    String tipo; // Hatch, Sedan, etc.
    int ano;
    String motor; // Ex: "2.0 8v Flex"
    double aceleracaoZeroACem; // Tempo em segundos para ir de 0 a 100 km/h
    int cavalos; // Potência do motor
    boolean temArCondicionado;
    boolean cambioAutomatico;

    // Criar um carro com valores específicos
    public Carro(String modelo, String tipo, int ano, String motor, double aceleracaoZeroACem, int cavalos,
                 boolean temArCondicionado, boolean cambioAutomatico) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.ano = ano;
        this.motor = motor;
        this.aceleracaoZeroACem = aceleracaoZeroACem;
        this.cavalos = cavalos;
        this.temArCondicionado = temArCondicionado;
        this.cambioAutomatico = cambioAutomatico;
    }

    // Exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ano: " + ano);
        System.out.println("Motor: " + motor);
        System.out.println("Potência: " + cavalos + " cv");
        System.out.println("0 a 100 km/h em: " + aceleracaoZeroACem + " segundos");
        System.out.println("Ar-condicionado: " + (temArCondicionado ? "Sim" : "Não"));
        System.out.println("Câmbio automático: " + (cambioAutomatico ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        // Objeto Astra 2006
        Carro astra = new Carro(
            "Chevrolet Astra Advantage", 
            "Hatch", 
            2006, 
            "2.0 8v Flex", 
            10.5, // Tempo aproximado de 0 a 100 km/h
            127, // Cavalos
            true, 
            false
        );

        // Exibir Informações
        astra.exibirInformacoes();
    }
}
