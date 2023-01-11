package br.com.casellibusiness.casellimanager.controllers;

import br.com.casellibusiness.casellimanager.domain.dto.FixedCostsDtoResponse;
import br.com.casellibusiness.casellimanager.usecases.FindByIdFixedCostsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/costs")
public class FixedCostsController {

    private final FindByIdFixedCostsUseCase findByIdFixedCostsUseCase;


    @GetMapping("/{id}")
    public FixedCostsDtoResponse findById(@PathVariable long id){
        return this.findByIdFixedCostsUseCase.execute(id);
    }
}
