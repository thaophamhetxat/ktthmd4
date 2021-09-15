package com.codegym.controller;

import moduls.QuocGia;
import moduls.ThanhPho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.IQuocGiaService;
import service.IThanhPhoService;

import javax.validation.Valid;
import java.util.ArrayList;
@Controller
public class ThanhPhoController {
@Autowired
    IThanhPhoService iThanhPhoService;
    @Autowired
    IQuocGiaService iQuocGiaService;


    //    @ExceptionHandler(Exception.class)
//    public ModelAndView error(Exception e) {
//        ModelAndView modelAndView = new ModelAndView("error");
//        return modelAndView;
//    }

    @ModelAttribute
    public ArrayList<QuocGia> listQuocGia(Exception e) {
        return iQuocGiaService.showAllQuocGia();
    }
//
    @RequestMapping("home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("listTP", iThanhPhoService.findAll());
        return modelAndView;
    }
//
    @GetMapping("create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("listQuocGia", new ThanhPho());
        return modelAndView;
    }

    @PostMapping("create")
    public ModelAndView create(@Valid  @ModelAttribute("listQuocGia") ThanhPho thanhPho, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("create");
            return modelAndView;
        }
        iThanhPhoService.save(thanhPho);
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }
//
    @GetMapping("/edit/{idThanhPho}")
    public ModelAndView showEdit(@PathVariable int idThanhPho) {
        ModelAndView modelAndView = new ModelAndView("edit", "listQuocGia", iQuocGiaService.showAllQuocGia());
        modelAndView.addObject("listTP", iThanhPhoService.findById(idThanhPho));
        return modelAndView;
    }

    @PostMapping("/edit/{idThanhPho}")
    public ModelAndView edit(@ModelAttribute ThanhPho nhanVien) {
        iThanhPhoService.edit(nhanVien);
        return new ModelAndView("redirect:/home");
    }
//
//
//
    @GetMapping("/delete/{idThanhPho}")
    public ModelAndView delete(@PathVariable int idThanhPho) {
        iThanhPhoService.delete(iThanhPhoService.findById(idThanhPho));
        return new ModelAndView("redirect:/home");
    }
//
//
//
//    @GetMapping("/findByName")
//    public ModelAndView findByName(@RequestParam String findName) {
//        ModelAndView modelAndView = new ModelAndView("home");
//        modelAndView.addObject("listNV", iNhanVienService.findAllByName(findName));
//        return modelAndView;
//    }
//
//
//
    @GetMapping("/detail/{idThanhPho}")
    public ModelAndView showDetail(@PathVariable int idThanhPho) {
        ModelAndView modelAndView = new ModelAndView("detail", "listQuocGia", iQuocGiaService.showAllQuocGia());
        modelAndView.addObject("listTP", iThanhPhoService.findById(idThanhPho));
        return modelAndView;
    }

}
