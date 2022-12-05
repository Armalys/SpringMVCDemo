package ge.me.springmvcdemo.controller;

import ge.me.springmvcdemo.repository.AircraftRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class PositionController {
    @NonNull
    private final AircraftRepository repository;

    @GetMapping("/aircraft")
    public String getCurrentAircraftPositions(Model model) {
//        repository.deleteAll();

        model.addAttribute("currentPositions", repository.findAll());
        return "positions";
    }
}
