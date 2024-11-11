package pe.edu.upc.managewise.backend.backlog.interfaces.rest.resources;

import pe.edu.upc.managewise.backend.backlog.domain.model.valueobjects.Status;

public record TaskItemResource(
        Long taskId,
        String title,
        String description,
        Integer estimation) {
}
