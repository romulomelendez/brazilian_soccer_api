package com.example.project.api.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "titles_BR")
public class TitleBR {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "campeonato_estadual", length = 30)
    List<Integer> estadual = new ArrayList<Integer>();

    @Column(name = "campeonato_brasileiro", length = 30)
    List<Integer> brasileirao = new ArrayList<Integer>();

    @Column(name = "copa_do_brasil", length = 30)
    List<Integer> copaDoBrasil = new ArrayList<Integer>();

    @Column(name = "copa_libertadores_da_america", length = 30)
    List<Integer> libertadoresDaAmerica = new ArrayList<Integer>();

    @Column(name = "supercopa_do_Brasil", length = 30)
    List<Integer> supercopaDoBrasil = new ArrayList<Integer>();

    @Column(name = "mundial_de_clubes_FIFA", length = 30)
    List<Integer> mundialDeClubes = new ArrayList<Integer>();

    @Column(name = "copa_sulamericana", length = 30)
    List<Integer> copaSulamericana = new ArrayList<Integer>();

    @Column(name = "recopa_sulamericana", length = 30)
    List<Integer> recopa = new ArrayList<Integer>();

}
