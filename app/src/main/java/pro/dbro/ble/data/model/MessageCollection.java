package pro.dbro.ble.data.model;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;


/**
 * Created by davidbrodsky on 10/20/14.
 */
public class MessageCollection extends CursorModel {

    public MessageCollection(@NonNull Cursor cursor) {
        super(cursor);
    }

    @Nullable
    public Message getMessageAtPosition(int position) {
        boolean success = mCursor.move(position);
        if (success)
            return new Message(mCursor);
        return null;
    }

    public Cursor getCursor() {
        return mCursor;
    }
}
