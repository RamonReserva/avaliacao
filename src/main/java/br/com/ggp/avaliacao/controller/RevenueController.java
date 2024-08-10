package br.com.ggp.avaliacao.controller;

import br.com.ggp.avaliacao.model.Revenue;
import br.com.ggp.avaliacao.repository.RevenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receitas")
public class RevenueController {

    @Autowired
    private RevenueRepository revenueRepository;

    @GetMapping("/{userId}")
    public List<Revenue> getRevenuesByUserId(@PathVariable("userId") Long userId) {
        return revenueRepository.findAllByUserId(userId);
    }

    @PostMapping
    public Revenue createRevenue(@RequestBody Revenue revenue){
        return revenueRepository.save(revenue);
    }
}
