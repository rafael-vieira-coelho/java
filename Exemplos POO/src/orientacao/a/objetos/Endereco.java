package orientacao.a.objetos;

/**
 *
 * @author coelho
 */
class Endereco {

    private String cidade;
    private String cep;
    private int numero;
    private String rua;
    private String estado;

    public Endereco(String cidade, String cep, int numero, String rua, String estado) {
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
        this.rua = rua;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade: " + cidade
                + " Cep: " + cep
                + " Número: " + numero 
                + " Rua: " + rua
                + " Estado: " + estado;                
    }

    public static void main(String[] args) {
        
        Endereco e = new Endereco("Farroupilha", 
                "95180-000", 
                785, 
                "Av. São Vicente", 
                "RS");
        
        System.out.println(e.toString());
    }
}