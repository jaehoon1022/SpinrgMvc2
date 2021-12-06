package hello.itemservice.web.form;

import hello.itemservice.domain.item.TestItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@Slf4j
public class FormTest {

    @GetMapping("/test")
    public String add(@ModelAttribute TestItem testItem, Model model){
        model.addAttribute("testItem", testItem);

        Map<String, String> fruits = new LinkedHashMap<>();
        fruits.put("APPLE", "사과");
        fruits.put("GRAPE", "포도");
        fruits.put("PEAR", "배");

        model.addAttribute("fruits", fruits);


        return "form/test";
    }




}
