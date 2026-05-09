package org.koitharu.kotatsu.parsers.util

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runInterruptible
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import org.koitharu.kotatsu.parsers.MangaParser
import org.koitharu.kotatsu.parsers.model.Manga
import org.koitharu.kotatsu.parsers.model.MangaSource

public class LinkResolver internal constructor(
	private val parser: MangaParser,
	public val link: HttpUrl,
) {

	public suspend fun getSource(): MangaSource? = parser.source

	public suspend fun getManga(): Manga? {
		return parser.resolveLink(this, link)
	}
}
