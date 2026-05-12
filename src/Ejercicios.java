public class Ejercicios {
    public Ejercicios(){

    }
    // consecutivos con recursividad
    public int sumaConsecutivos(int num){
        // caso base
        // cuando es solo una linea de codigo no es necesario las llaves
        System.out.println();
        if (num==1)
            return num;
        
        // Parte recursividad
        return num +sumaConsecutivos(num-1);
    }

    public int sumaConsecutivosPasos(int num){
        // caso base
        // cuando es solo una linea de codigo no es necesario las llaves
        System.out.println();
        if (num==1)
            return num;
        
        // Parte recursividad
        int resultadoRecursivo =sumaConsecutivos(num-1);
        int resultadoOperacion = num + resultadoRecursivo;
        System.out.println("resultadoOperacion="+num +"+"+"sumaConsecutivosPasos("+resultadoRecursivo+")");
        return num +sumaConsecutivos(num-1);
    }
}
