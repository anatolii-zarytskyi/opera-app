package opera.academy.spring.service.mapper;

import opera.academy.spring.dto.request.PerformanceRequestDto;
import opera.academy.spring.dto.response.PerformanceResponseDto;
import opera.academy.spring.model.Performance;
import org.springframework.stereotype.Component;

@Component
public class PerformanceMapper implements RequestDtoMapper<PerformanceRequestDto, Performance>,
        ResponseDtoMapper<PerformanceResponseDto, Performance> {
    @Override
    public Performance mapToModel(PerformanceRequestDto dto) {
        Performance movie = new Performance();
        movie.setTitle(dto.getPerformanceTitle());
        movie.setDescription(dto.getPerformanceDescription());
        return movie;
    }

    @Override
    public PerformanceResponseDto mapToDto(Performance performance) {
        PerformanceResponseDto responseDto = new PerformanceResponseDto();
        responseDto.setPerformanceId(performance.getId());
        responseDto.setPerformanceTitle(performance.getTitle());
        responseDto.setPerformanceDescription(performance.getDescription());
        return responseDto;
    }
}
