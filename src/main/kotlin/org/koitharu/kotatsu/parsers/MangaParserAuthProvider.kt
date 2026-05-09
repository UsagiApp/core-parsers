package org.koitharu.kotatsu.parsers

public interface MangaParserAuthProvider {

	public val isAuthorized: Boolean

	public suspend fun getUsername(): String?
}
