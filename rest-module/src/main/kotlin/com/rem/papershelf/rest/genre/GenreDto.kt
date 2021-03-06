package com.rem.papershelf.rest.genre

import org.springframework.hateoas.ResourceSupport
import org.springframework.hateoas.core.Relation

@Relation(value = "genre", collectionRelation = "genres")
class GenreDto(var id: String = "",
               var name: String = "",
               var description: String = ""): ResourceSupport()