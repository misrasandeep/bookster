package com.bookster.domain

class Author {
	String name
	static hasMany = [books:Book]
    static constraints = {
    }
}
