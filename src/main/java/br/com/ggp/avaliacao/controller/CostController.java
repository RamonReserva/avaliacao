package br.com.ggp.avaliacao.controller;

import br.com.ggp.avaliacao.model.Cost;
import br.com.ggp.avaliacao.repository.CostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/gastos")

public class CostController {

    @Autowired
    private CostRepository costRepository;

    @GetMapping("/{userid}")
    public List<Cost> getCostsByUserId(@PathVariable("userid") Long userId ) {
        return costRepository.findAllByUserId(userId);
    }

    @PostMapping
    public Cost createCost(@RequestBody Cost cost){
        return costRepository.save(cost);
    }
}
