package com.example.raw.dc.lab5.repository

import com.example.raw.dc.lab5.bean.Marker

interface MarkersRepository {
	suspend fun create(item: Marker): Long?

	suspend fun getById(id: Long): Marker?

	suspend fun getAll(): List<Marker?>

	suspend fun update(item: Marker): Boolean

	suspend fun deleteById(id: Long): Boolean
}