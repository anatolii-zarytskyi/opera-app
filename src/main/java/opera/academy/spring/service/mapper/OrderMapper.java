package opera.academy.spring.service.mapper;

import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;
import opera.academy.spring.dto.response.OrderResponseDto;
import opera.academy.spring.model.Order;
import opera.academy.spring.model.Ticket;
import opera.academy.spring.util.DateTimePatternUtil;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements ResponseDtoMapper<OrderResponseDto, Order> {
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(DateTimePatternUtil.DATE_TIME_PATTERN);

    @Override
    public OrderResponseDto mapToDto(Order order) {
        OrderResponseDto responseDto = new OrderResponseDto();
        responseDto.setId(order.getId());
        responseDto.setUserId(order.getUser().getId());
        responseDto.setOrderTime(order.getOrderTime().format(formatter));
        responseDto.setTicketIds(order.getTickets()
                .stream()
                .map(Ticket::getId)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
