package Conversor;

public class Conversion {
    private String monedaBase;
    private String monedaCambio;
    private float valorUnitario;
    private float resultado;

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaCambio() {
        return monedaCambio;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public float getResultado() {
        return resultado;
    }

    public Conversion(ConversionApiInterpreter conversionApi) {
        this.monedaBase = conversionApi.base_code();
        this.monedaCambio = conversionApi.target_code();
        this.valorUnitario = conversionApi.conversion_rate();
        this.resultado = conversionApi.conversion_result();
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "monedaBase='" + monedaBase + '\'' +
                ", monedaCambio='" + monedaCambio + '\'' +
                ", valorUnitario=" + valorUnitario  + '\''+
                ", resultado=" + resultado +
                '}';
    }
}
