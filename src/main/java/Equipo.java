public class Equipo {

    private Trabajador lider;

    private Trabajador participante1;
    private Trabajador participante2;
    private Trabajador participante3;

    public int getMaxNumeroParticipantes() {
        return Ctes.MAX_NUM_PARTICIPANTES_EQUIPO;
    }

    public Trabajador getParticipante(int numero) {
        switch (numero) {
            case 1: return participante1;
            case 2: return participante2;
            case 3: return participante3;
        }
        return null;
    }

    public void setParticipante(int numero, Trabajador trabajador) {
        switch (numero) {
            case 1: participante1 = trabajador; break;
            case 2: participante2 = trabajador; break;
            case 3: participante3 = trabajador; break;
        }
    }

    public boolean tieneLider() {
        // TODO 21: DONE Saber si el equipo tiene líder
        return lider != null;
    }

    public Trabajador getLider() {
        // TODO 22: DONE Devolver quién es el líder
        return lider;
    }

    public void setLider(int numeroParticipante) {
        // TODO 23: DONE Asignar el liderazgo a un participante
        lider = getParticipante(numeroParticipante);
    }

    public int getNumeroParticipantes() {
        // TODO 24: DONE Calcular el número de participantes utilizando un bucle
        int num = 0;
        for (int i = 1; i <= getMaxNumeroParticipantes(); i++) {
            if (getParticipante(i) != null) {
                num ++;
            }
        }
        return num;
    }

    public boolean estaEquipoCompleto() {
        return getNumeroParticipantes() == getMaxNumeroParticipantes();
    }

    public boolean addParticipante(Trabajador trabajador) {
        // TODO 25: DONE
        //  Agregar un trabajador como participante
        //  si no se ha llegado al límite utilizando un bucle
        for (int i = 1; i <= getMaxNumeroParticipantes() ; i++) {
            if (getParticipante(i) == null) {
                setParticipante(i, trabajador);
                return true;
            }
        }
        return false;
    }

    public void mostrar() {
        // TODO 26: DONE Mostrar los participantes del equipo junto con su número de participante utilizando un bucle
        for (int i = 1; i <= getMaxNumeroParticipantes(); i++) {
            Trabajador participante = getParticipante(i);
            if (participante != null) {
                System.out.printf("%d. %s\n", i, participante.toString());
            }
        }
    }

    public int getPrecioHora() {
        int precio = 0;
        // TODO 27: DONE Calcular el precio de la hora de todos los participantes del equipo utilizando un bucle
        for (int i = 1; i < getMaxNumeroParticipantes(); i++) {
            Trabajador participante = getParticipante(i);
            if (participante != null) {
                precio += participante.getPrecioHora();
            }
        }
        return precio;
    }

}
