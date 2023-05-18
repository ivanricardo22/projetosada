import java.time.LocalDate;

public class Aplicacao {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Pessoa ivan = new Pessoa();
        ivan.nome = "Ivan Ricardo";
        ivan.nomeDaMae = "Neide Maria";
        ivan.dataNascimento = LocalDate.of(1988 , 10 , 12);
        ivan.cpf = 072.57420467;

        Conta contaDoIvan = new Conta();
        System.out.println(contaDoIvan.saldo);
        contaDoIvan.deposita(200);
        System.out.println(contaDoIvan.saldo);

        contaDoIvan.titular = ivan;
        System.out.println(contaDoIvan.titular.nome);
        System.out.println(contaDoIvan.titular.cpf);
        System.out.println(contaDoIvan.titular.dataNascimento);




        Conta contaDoRicado = new Conta();
        contaDoRicado.deposita(300);
        System.out.println(contaDoRicado.saldo);
        contaDoRicado.transfere(200 , contaDoIvan );

        System.out.println(contaDoIvan.saldo);
        System.out.println(contaDoRicado.saldo);

        contaDoRicado.titular = new Pessoa();
        contaDoRicado.titular.nome = "Ricardo Santos ";
        System.out.println(contaDoRicado.titular.nome);
        contaDoRicado.titular.dataNascimento = LocalDate.of(2000 , 10, 12);
        System.out.println(contaDoRicado.titular.dataNascimento);
        contaDoRicado.titular.cpf = 12554.5898;
        System.out.println(contaDoRicado.titular.cpf);
        contaDoRicado.titular.nomeDaMae = "Madalena";
        System.out.println(contaDoRicado.titular.nomeDaMae);

    }
}