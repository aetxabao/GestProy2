public class Proyecto {

    private String nombre;
    private Equipo equipo;
    private int horas;
    private int presupuesto;

    // region constructores
    public Proyecto(String nombre){
        // TODO 41: DONE Constructor 1 Proyecto
        this(nombre, 0);
    }
    public Proyecto(String nombre, int presupuesto) {
        // TODO 42: DONE Constructor 2 Proyecto
        this.nombre = nombre;
        equipo = new Equipo();
        horas = 0;
        this.presupuesto = presupuesto;
    }
    // endregion

    // region getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    // endregion

    public void addHoras(int horas) {
        this.horas += horas;
    }

    public int getPrecio() {
        return horas * equipo.getPrecioHora();
    }

    public boolean addParticipante(Trabajador trabajador) {
        return equipo.addParticipante(trabajador);
    }

    public Trabajador getLider() {
        return equipo.getLider();
    }

    public void setLider(int numeroParticipante) {
        equipo.setLider(numeroParticipante);
    }
    public void mostrarEquipo() {
        // TODO 43: DONE Mostrar el equipo
        equipo.mostrar();
    }

    public String toString() {
        // TODO 44: DONE  Mostrar la información del proyecto según el formato dado utilizando String.format
        // 20 huecos para el nombre del proyecto y 10 para el nombre del líder alineados a la izquierda
        // 10 huecos para cada número entero alineados a la derecha. Después de las horas poner " h."
        // los tres últimos valores se corresponden con el precio de coste, el presupuesto y la diferencia
        //          1         2         3         4         5         6         7         8
        // 12345678901234567890123456789012345678901234567890123456789012345678901234567890
        // |                   |        |         |            |         |         |
        // CartasCoches        Aitor             10 h.      1300      1200      -100
        String nombreLider = "";
        Trabajador lider = equipo.getLider();
        if (lider != null) {
            nombreLider = lider.getNombre();
        }
        return String.format("%-20s%-20s%-8d h.%10d%10d%10d",
                nombre,
                nombreLider,
                horas,
                presupuesto,
                getPrecio(),
                presupuesto - getPrecio());
    }

}