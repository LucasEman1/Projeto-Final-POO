package escola;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgendamentoDaReuniao {
    private String assunto;
    private Date dataDaReuniao;

    private static List<AgendamentoDaReuniao> reunioes = new ArrayList<>();

    public AgendamentoDaReuniao(String assunto, Date dataDaReuniao) {
        this.assunto = assunto;
        this.dataDaReuniao = dataDaReuniao;
    }

    public void agendarReuniao() {
        reunioes.add(this);
        System.out.println("Reunião agendada com sucesso: " + this.assunto);
    }

    public static void mostrarReunioes() {
        if (reunioes.isEmpty()) {
            System.out.println("Nenhuma reunião agendada.");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            System.out.println("Reuniões agendadas:");
            for (AgendamentoDaReuniao reuniao : reunioes) {
                System.out.println("Assunto: " + reuniao.getAssunto() +
                        " | Data: " + sdf.format(reuniao.getDataDaReuniao()));
            }
        }
    }

    public static void removerReuniao(String assunto) {
        AgendamentoDaReuniao reuniaoARemover = null;
        for (AgendamentoDaReuniao reuniao : reunioes) {
            if (reuniao.getAssunto().equalsIgnoreCase(assunto)) {
                reuniaoARemover = reuniao;
                break;
            }
        }
        if (reuniaoARemover != null) {
            reunioes.remove(reuniaoARemover);
            System.out.println("Reunião removida com sucesso: " + assunto);
        } else {
            System.out.println("Reunião com o assunto '" + assunto + "' não encontrada.");
        }
    }

    public static void editarReuniao(String assunto, String novoAssunto, Date novaData) {
        for (AgendamentoDaReuniao reuniao : reunioes) {
            if (reuniao.getAssunto().equalsIgnoreCase(assunto)) {
                reuniao.setAssunto(novoAssunto);
                reuniao.setDataDaReuniao(novaData);
                System.out.println("Reunião editada com sucesso: " + novoAssunto);
                return;
            }
        }
        System.out.println("Reunião com o assunto '" + assunto + "' não encontrada.");
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Date getDataDaReuniao() {
        return dataDaReuniao;
    }

    public void setDataDaReuniao(Date dataDaReuniao) {
        this.dataDaReuniao = dataDaReuniao;
    }
}
