package main.java.map.Ordenacao;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private final Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate proximaData;
        Evento proximoEvento;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 31), "show 1", "atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 2), "show 2", "atracao2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 30), "show 3", "atracao3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
