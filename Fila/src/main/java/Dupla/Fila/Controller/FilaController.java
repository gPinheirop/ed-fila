package Dupla.Fila.Controller;

import Dupla.Fila.DAO.Fila;
import Dupla.Fila.Model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilaController {

    @Autowired
    Fila contatos;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("newContact", new Contato());
        return "/home";
    }

    @PostMapping("/")
    public String registerContact(@ModelAttribute("newContact") Contato newContact, Model model) {
        contatos.adicionar(new Contato(newContact.getNome(), newContact.getNumero()));

        return "/home";
    }

    @GetMapping("/proxContact")
    public String proxContact(Model model) {
        Contato contact = contatos.proximoContato();

        model.addAttribute("contact", contact);
        model.addAttribute("newContact", new Contato());

        return "/home";
    }
}
