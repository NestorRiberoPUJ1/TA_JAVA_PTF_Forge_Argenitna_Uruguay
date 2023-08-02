package com.ayudantia.modelos.controllers;

import com.ayudantia.modelos.models.User;
import com.ayudantia.modelos.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("")
  public String index(
    Model model,
    HttpSession session,
    @ModelAttribute("user") User user
  ) {
    List<User> users = userService.obtenerUsers();
    model.addAttribute("users", users);

    return "index.jsp";
  }

  @PostMapping(value = "")
  public String create(
    @Valid @ModelAttribute("user") User user,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "index.jsp";
    } else {
      userService.crearUser(user);
      return "redirect:/user";
    }
  }
}
