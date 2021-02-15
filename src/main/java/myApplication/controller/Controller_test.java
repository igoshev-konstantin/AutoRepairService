package myApplication.controller;


import myApplication.entity.Car;
import myApplication.entity.CarColor;
import myApplication.entity.CarLabel;
import myApplication.service.CarPropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Controller_test {

    @Autowired
    private CarPropertiesService carPropertiesService;

    @RequestMapping("/")
    public String showMainView(Model model) {

//        Car car = new Car();
//        List<CarLabel> carLabels = carPropertiesDAO.getAllCarLabels();
//        List<CarColor> carColors = carPropertiesDAO.getAllCarColors();
//
//        model.addAttribute("car",car);
//        model.addAttribute("carLabels",carLabels);
//        model.addAttribute("carColors",carColors);

        return "main-view";
    }

//    @RequestMapping("/add-new-car")
    @GetMapping("/add-new-car")
    public String addNewCar(Model model) {
        Car car = new Car();
        List<CarLabel> carLabels = carPropertiesService.getAllCarLabels();
        List<CarColor> carColors = carPropertiesService.getAllCarColors();

        model.addAttribute("car",car);
        model.addAttribute("carLabels",carLabels);
        model.addAttribute("carColors",carColors);
        return "add-new-car";
    }

    @RequestMapping("/saveNewCar")
    public String saveNewCar(Model model){
        System.out.println(model);
        //System.out.println("sdfds"+model.getAttribute("car"));
    //public String saveNewCar(@ModelAttribute("car") Car car){
    /*public String saveNewCar(@ModelAttribute("car") Car car,
                             @ModelAttribute("carLabel") CarLabel carLabel,
                             @ModelAttribute("carColor") CarColor carColor){*/
//        car.setCarColor(carColor);
//        car.setCarLabel(carLabel);
//        carPropertiesDAO.saveCar(car);
        return "redirect:/";
    }
}
