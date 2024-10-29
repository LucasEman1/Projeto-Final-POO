package escola;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDaReuniao {
    private String assunto;
    private String dataDaReuniao;

    private static List<AgendamentoDaReuniao> reunioes = new ArrayList<>();

    public AgendamentoDaReuniao(String assunto, String dataDaReuniao) {
        this.assunto = assunto;
        this.dataDaReuniao = dataDaReuniao;
    }

    public void agendarReuniao() {
        reunioes.add(this);
        System.out.println("Reunião agendada com sucesso: " + this.assunto);
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

    public static void editarReuniao(String assunto, String novoAssunto, String novaData) {
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

    public String getDataDaReuniao() {
        return dataDaReuniao;
    }

    public void setDataDaReuniao(String dataDaReuniao) {
        this.dataDaReuniao = dataDaReuniao;
    }
}
