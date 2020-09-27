package com.example.epoxyapplication.epoxyapplication

data class SampleModel(val type: String, val content: String)

fun getSampleData() = listOf(
    SampleModel("Header", "Category 1"),
    SampleModel("Content", "Hello World"),
    SampleModel("Content", "Lorem-Ipsum"),
    SampleModel("Content", "Hello Android"),
    SampleModel("Header", "Category 2"),
    SampleModel("Content", "Hello World"),
    SampleModel("Content", "Lorem-Ipsum"),
    SampleModel("Content", "Hello Android"),
    SampleModel("Header", "Category 3"),
    SampleModel("Content", "Hello World"),
    SampleModel("Content", "Lorem-Ipsum"),
    SampleModel("Content", "Hello Android"),
    SampleModel("Header", "Category 4"),
    SampleModel("Content", "Hello World"),
    SampleModel("Content", "Lorem-Ipsum"),
    SampleModel("Content", "Hello Android"),
    SampleModel("Footer", "End of list"),
)