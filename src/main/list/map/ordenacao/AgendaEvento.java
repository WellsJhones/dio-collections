package main.list.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    //atributos
    private Map<LocalDate, Evento> eventos;

    //getters
    public Map<LocalDate, Evento> getEventos() {
        return eventos;
    }

    public AgendaEvento(){this.eventos =new HashMap<>();}

    //metodos
    public void adicionar(LocalDate data, Evento evento) {
        this.eventos.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventos);
        System.out.println(eventosTreeMap);
    }
    //obter proximo evento

    public void  obterProximo() {

       LocalDate dataAtual = LocalDate.now();
       LocalDate proximaData = null;
       Evento proximoEvento = null;
       Map<LocalDate, Evento> eventosTreeMap2 = new TreeMap<>(eventos);
       for(Map.Entry<LocalDate,Evento> entry: eventosTreeMap2.entrySet()) {
           if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
               proximaData = entry.getKey();
               proximoEvento = entry.getValue();
               System.out.println("O próximo evento é: " + proximoEvento.getNome() + " na data: " + proximaData);
           }
       }

    }

    public static void main(String[] args) {

        AgendaEvento agenda = new AgendaEvento();
        agenda.adicionar(LocalDate.of(2025, 01, 01), new Evento("Teste", "vtc"));
        agenda.adicionar(LocalDate.of(2022, 01,03), new Evento("Teste1", "vtc1"));
        agenda.adicionar(LocalDate.of(2022, 01, 05), new Evento("Teste2", "vtc2"));
        agenda.adicionar(LocalDate.of(2024, 11, 07), new Evento("Teste3", "vtc3"));
        agenda.adicionar(LocalDate.of(2022, 01, 10), new Evento("Teste4", "vtc4"));


        agenda.exibirAgenda();
        agenda.obterProximo();


    }
}
