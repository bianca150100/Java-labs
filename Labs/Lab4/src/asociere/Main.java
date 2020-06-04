package asociere;

public class Main {
    public static void main (String[] argv)
    {
        Profesor profesorPrincipalMate= new Profesor(1, "Popescu" );
        Profesor profesorSecundarMate= new Profesor(2, "Mincu");
        Profesor profesorInfo=new Profesor(3,"Consti");
        Profesor profesorMateInfo=new Profesor(4, "Petrescu");
        Profesor profesorInfoMate= new Profesor(5, "Andrei");

        Departament departamentInfo=new Departament("info");
        departamentInfo.setProfesori(new Profesor[]{profesorInfo, profesorInfoMate, profesorMateInfo});
        Departament departamentMate= new Departament("mate");
        departamentMate.setProfesori(new Profesor[]{profesorPrincipalMate,profesorInfoMate,profesorMateInfo, profesorSecundarMate});

        Universitate unibuc= new Universitate("Unibuc", new Departament[]{departamentInfo,departamentMate});
        System.out.println(unibuc);

        departamentInfo=null;
        System.out.println(unibuc);

        //System.out.println(departamentMate);
       // departamentMate=null;


        System.out.println(departamentMate);
        profesorSecundarMate=null;
        departamentMate.getProfesori()[1]=null;
        System.out.println(departamentMate);
        System.out.println(profesorSecundarMate);


    }
}
