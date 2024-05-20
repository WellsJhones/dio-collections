package main.list.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }

    //método
    public void addContato(String nome, Integer telefone) {
        //put == adicionar ou atualizar
        agendaContatoMap.put(nome, telefone);
    }

    public void removeContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(String nome) {
       System.out.println(agendaContatoMap);
    }
    public Integer getContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        }

        return 0;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.addContato("Lucas", 123456789);
        agendaContatos.addContato("Lucas2", 123456789);
        agendaContatos.addContato("Lucas3", 123456789);
//        agendaContatos.exibirContato("Lucas");
        agendaContatos.exibirContato("Lucas2");
        agendaContatos.removeContato("Lucas");
//        agendaContatos.exibirContato("Lucas");
        agendaContatos.getContato("Lucas2");
    }
}
