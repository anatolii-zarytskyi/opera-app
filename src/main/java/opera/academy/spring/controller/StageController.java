package opera.academy.spring.controller;

import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import opera.academy.spring.dto.request.StageRequestDto;
import opera.academy.spring.dto.response.StageResponseDto;
import opera.academy.spring.model.Stage;
import opera.academy.spring.service.StageService;
import opera.academy.spring.service.mapper.StageMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stages")
public class StageController {
    private final StageService stageService;
    private final StageMapper stageMapper;

    public StageController(StageService stageService,
                           StageMapper stageMapper) {
        this.stageService = stageService;
        this.stageMapper = stageMapper;
    }

    @PostMapping
    public StageResponseDto add(@RequestBody @Valid StageRequestDto requestDto) {
        Stage stage = stageService.add(stageMapper.mapToModel(requestDto));
        return stageMapper.mapToDto(stage);
    }

    @GetMapping
    public List<StageResponseDto> getAll() {
        return stageService.getAll()
                .stream()
                .map(stageMapper::mapToDto)
                .collect(Collectors.toList());
    }
}
