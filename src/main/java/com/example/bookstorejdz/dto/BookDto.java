package com.example.bookstorejdz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel(value = "BookDto", description = "All details about book")
public class BookDto {
//    @ApiModelProperty(
//            readOnly = true,
//            value = "id",
//            dataType = "int",
//            example = "22",
//            notes = "The database denerated id for book record"
//    )
    private long id;
//    @ApiModelProperty(
//            value = "title",
//            dataType = "String",
//            example = "book Title",
//            notes = "book title",
//            required = true
//    )
    private String title;
//    @ApiModelProperty(
//            value = "description",
//            dataType = "String",
//            example = "book description",
//            notes = "book description",
//            required = true
//    )
    private String description;
//    @ApiModelProperty(
//            value = "releaseYear",
//            dataType = "int",
//            example = "2020",
//            notes = "book date release",
//            required = true
//    )
    private int releaseYear;

}
