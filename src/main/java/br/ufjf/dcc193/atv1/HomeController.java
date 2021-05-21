package br.ufjf.dcc193.atv1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping("index.hmtl")
  public String home() {
    return "index.jsp";
  }
}
