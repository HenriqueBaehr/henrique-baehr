public class Conta {
    public static void main(String[] args) {
        Usuario v1 = new Usuario();
        v1.nome = "Fibeas";
        v1.sexo = 'M';
        v1.dataDeNascimento = "11/09/2001";
        v1.estadoCivil = "Solteiro";
        System.out.println("O seu nome é "+v1.nome+", seu sexo é "+ v1.sexo+", sua data de nascimento é "+v1.dataDeNascimento+" e você está "+v1.estadoCivil);


        Usuario v2 = new Usuario();
        v2.nome = "Dobu";
        v2.sexo = 'F';
        v2.dataDeNascimento = "08/08/2008";
        v2.estadoCivil = "divorciada";
        System.out.println("O seu nome é "+v2.nome+", seu sexo é "+ v2.sexo+", sua data de nascimento é "+v2.dataDeNascimento+" e você está "+v2.estadoCivil);

    }
}
