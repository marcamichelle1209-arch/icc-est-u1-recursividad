public class Ejercicios {
    public Ejercicios(){

    }
    // consecutivos con recursividad
    public int sumaConsecutivos(int num){
        // caso base
        // cuando es solo una linea de codigo no es necesario las llaves
        System.out.println("El numero es:"+num);
        if (num==1)
            return num;
        
        // Parte recursividad
        return num +sumaConsecutivos(num-1);
    }

    public int sumaConsecutivosPasos(int num){
        // caso base
        // cuando es solo una linea de codigo no es necesario las llaves
        System.out.println("El numero es:"+num);
        if (num==1)
            return num;
        
        // Parte recursividad
        int resultadoRecursivo =sumaConsecutivosPasos(num-1);
        int resultadoOperacion = num + resultadoRecursivo;
        System.out.println("ResultadoOp"+num +"+"+"sumaConsecutivosPasos("+resultadoRecursivo+")");
        return num +sumaConsecutivosPasos(num-1);
    }

    // Potencia de unn numero: Escribe una funcion recursividad
    // que calcule la potencia de un numero base elevado a 
    // exponente entero.
    // parte recursiva  del numero
    public int getPotencia(int base, int exponente){

        if (exponente==1)
            return base;
        return base*getPotencia(base, exponente-1);



        
    }

    public int sumaDigitos(int num){
        // caso base
        if(num<10)
            return num;
        // caso recursivo
        return(num%10)+sumaDigitos(num/10);

    }   
}
