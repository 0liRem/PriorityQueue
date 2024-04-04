import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Vista {
    FileReader fr = null;
    BufferedReader br = null;
    String linea = null;
    ArbolTipoNoBinario arbolTipoNoBinario=new ArbolTipoNoBinario<String>();
    Scanner sc=new Scanner(System.in);
    public void menu(){
        System.out.println("Binevenido al IGSS, eliga la base de datos de pacientes que tienen cita hoy");
        System.out.println("Ingrese el nombre del archivo. Nota: debe encontrarse en la misma carpeta que el programa y poner el .txt al final ");//tecnologia del IGSS
        String arch=sc.nextLine();
        archivos(arch);   
        while (true) {   
            System.out.println("Ingrese 1, para ingresar un paciente \n ingrese 2, para pasar paciente \n 0, salir");
            int x=sc.nextInt();
            sc.nextLine();
        switch (x) {
            case 1:
            System.out.println("Ingrese nombre del paciente");
            String Nombre=sc.nextLine();
            System.out.println("Ingrese el caso");
            String Caso=sc.nextLine();
            System.out.println("Ingrese su prioridad");
            String Prioridad=sc.nextLine();
            Paciente paciente=new Paciente(Nombre,Caso ,Prioridad );
            arbolTipoNoBinario.insert(paciente);
            break;
            case 2:
            System.out.println("Atendido");
                arbolTipoNoBinario.eliminarRaizYReemplazar();
                break;
            case 0:
                return;
        }
    }

    }
        public void archivos(String arch){
        try {
            //Cargamos el archivo de la ruta relativa
            File archivo = new File(arch);
            //Cargamos el objeto FileReader
            fr = new FileReader(archivo);
            //Creamos un buffer de lectura
            br = new BufferedReader(fr);
            System.out.println("Se ha abierto con exito");
                    ArrayList<String> dat=new ArrayList<>();
            while ((linea = br.readLine()) != null) {
            //Utilizamos el separador para los datos
            dat.add(linea.toString());
            }
                for (String xd:dat){
                    String a[]=xd.split(",");
                    Paciente paciente= new Paciente(a[0],a[1],a[2]);
                    arbolTipoNoBinario.insert(paciente);

                }

        } catch (Exception e) {
            throw new RuntimeException("Archivo No Encontrado");
    }


}
}
