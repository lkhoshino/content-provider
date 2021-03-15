package com.example.contentprovidertest

import android.database.Cursor

interface NoteClickedListener {
    fun noteClickedItem(cursor: Cursor)
    fun noteRemovedItem(cursor: Cursor?)
}