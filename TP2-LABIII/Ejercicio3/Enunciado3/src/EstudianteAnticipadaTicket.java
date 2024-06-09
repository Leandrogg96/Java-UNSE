public class EstudianteAnticipadaTicket extends AnticipadaTicket{

    public EstudianteAnticipadaTicket(double precio, int diasAdelanto) {
        super(precio, diasAdelanto);
    }

    @Override
    double precioEntrada() {
        return 0;
    }
}
