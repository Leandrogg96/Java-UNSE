public class Password {
    private int longitud;
    private String clave;

    public Password(){
        this.longitud = 11;
        this.clave = generarClave();
    }

    public Password(int longitud){
        this.longitud = longitud;
        this.clave = generarClave();
    }

    public boolean esFuerte(){
        int mayus = 0;
        int minus = 0;
        int num = 0;

        for(int i = 0; i < this.clave.length(); i++){
            char c = this.clave.charAt(i);
            if (Character.isUpperCase(c)){
                mayus++;
            }else if (Character.isLowerCase(c)){
                minus++;
            } else if (Character.isDigit(c)){
                num++;
            }
        }

        if(mayus > 2 && minus > 1 && num > 5){
            return true;
        } else {
            return false;
        }
    }

    public String generarClave(){
        String num = "0123456789";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String mayus = minus.toUpperCase();
        String clave = num + minus + mayus;

        StringBuilder secure =new StringBuilder(this.longitud);

        for(int i = 0; i < this.longitud; i++){
            int indice = (int)(Math.random() * clave.length());
            secure.append(clave.charAt(indice));
        }

        return secure.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getClave() {
        return clave;
    }


}
