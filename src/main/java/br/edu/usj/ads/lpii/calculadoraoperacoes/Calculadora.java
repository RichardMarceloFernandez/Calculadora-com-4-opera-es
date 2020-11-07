package br.edu.usj.ads.lpii.calculadoraoperacoes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculadora {
    
    @PostMapping(value="/calcular")
    public ModelAndView postSomar (@RequestParam String a, @RequestParam String b, @RequestParam String ope) {
       
        ModelAndView modelAndView = new ModelAndView("index");     
        
        Double aDouble = Double.valueOf(a);
        Double bDouble = Double.valueOf(b);

        if (ope.equals("+")) {
            Double resultado = aDouble + bDouble;
            String operacao = a + " + " + b + " = " + resultado;
            modelAndView.addObject("resultado", operacao);
        } else if (ope.equals("-")) {
            Double resultado = aDouble - bDouble;
            String operacao = a + " - " + b + " = " + resultado;
            modelAndView.addObject("resultado", operacao);
        } else if (ope.equals("*")) {
            Double resultado = aDouble * bDouble;
            String operacao = a + " X " + b + " = " + resultado;
            modelAndView.addObject("resultado", operacao);
        } else if (ope.equals("/")) {
            Double resultado = aDouble / bDouble;
            String operacao = a + " / " + b + " = " + resultado;
            modelAndView.addObject("resultado", operacao);
        }
      
        return modelAndView;
    }

}
