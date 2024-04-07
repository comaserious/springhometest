package com.common;

import java.util.List;

public interface BookDAO {

    List<BookDTO> getAllBook();

    BookDTO selectOne(int sequence);


}
