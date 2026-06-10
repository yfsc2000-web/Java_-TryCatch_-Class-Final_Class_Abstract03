package TryCatch_Class_Final_Class_Abstract06.Aplications;
import TryCatch_Class_Final_Class_Abstract06.Entidades.Cadastro;
import TryCatch_Class_Final_Class_Abstract06.Entidades.StatusQuarto;
import TryCatch_Class_Final_Class_Abstract06.Entidades.Quartos;
import TryCatch_Class_Final_Class_Abstract06.Entidades.ValorHospedagem;
import TryCatch_Class_Final_Class_Abstract06.Entidades.Pagamento;
import TryCatch_Class_Final_Class_Abstract06.Entidades.StatusGeral;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
    Scanner sc = new Scanner(System.in);

    Cadastro cadastro=new Cadastro("","","",0,false);

        System.out.println("Digite o nome da sua cidade");
        cadastro.setCidade(sc.nextLine());

        System.out.println("Digite a data de chegada");
        cadastro.setDataChegada(sc.nextLine());

        System.out.println("Digite a data de saida");
        cadastro.setDateSaida(sc.nextLine());

        System.out.println("Digite a quantidade de hospedes");
        cadastro.setQuantiHospedes(sc.nextInt());
        sc.nextLine();

    List<Quartos> listaquarto = new ArrayList<>();

        listaquarto.add(new Quartos(55,StatusQuarto.DISPONiVEL));
        listaquarto.add(new Quartos(78, StatusQuarto.OCUPADO));
        listaquarto.add(new Quartos(33, StatusQuarto.DISPONiVEL));
        listaquarto.add(new Quartos(111, StatusQuarto.DISPONiVEL));



        try {
            for (Quartos numquartos:listaquarto){
                if (numquartos.getStatusquatos() == StatusQuarto.DISPONiVEL){
                    System.out.println("Quarto " + numquartos.getNumero() + numquartos.getStatusquatos().getDescricao());
                    cadastro.encontrou=true;
                }
                if (!cadastro.encontrou){
                    System.out.println("Nenhum quarto disponível");
                }


            }
        }
        catch (Exception e) {
            System.out.println("Número de cadastro não encontrado");
        }
        System.out.println("Você ficara hospedado por "+cadastro.quantiDias()+"dias");
    ValorHospedagem valorHospedagem=new ValorHospedagem(cadastro);
        System.out.println("O valor da hospedagem será de R$ "+valorHospedagem.valorfinal());

        System.out.println("Qual e a forma de pagamento?");
    Pagamento pagamento=new Pagamento("","");
        pagamento.setFormaPagamneto(sc.nextLine());


        System.out.println("O pagamento foi aceito?");
        pagamento.setPagamentoAceito(sc.nextLine());
       try {
           if (pagamento.getPagamentoAceito().equalsIgnoreCase("Sim")){
               System.out.println("Pagamento aprovado");
           }
           else {
               StatusGeral status= StatusGeral.PAGAMENTO_RECUSADO;
               System.out.println(status.getDescricao());
           }
       }
       catch (Exception e){
           System.out.println("Transação não aprovada");
       }
    StatusGeral status = StatusGeral.HOSPEDAGEM_REGISTRADA;
        System.out.println("O número da hospedagem será " + cadastro.numeroRegistro());
        System.out.println(status.getDescricao());

    status = StatusGeral.COMFIRMACAO_ENVIADA_POR_EMAIL;
        System.out.println(status.getDescricao());

    status=StatusGeral.RESERVA_CONFIRMADA;
        System.out.println(status.getDescricao());
}
}

