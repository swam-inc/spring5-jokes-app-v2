package com.swaminc.joke.controller;

import com.swaminc.joke.service.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NorrisQuotesController {

    private QuoteService quoteService;
    private String quote;

    public NorrisQuotesController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }


    public QuoteService getQuoteService() {
        return quoteService;
    }

    public void setQuoteService(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping({"/", ""})
    public String getQuote(Model model) {
        model.addAttribute("joke", quoteService.getQuote());
        return "quote";
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
