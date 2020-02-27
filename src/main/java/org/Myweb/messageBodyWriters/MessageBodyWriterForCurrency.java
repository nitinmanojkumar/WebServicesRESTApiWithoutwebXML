package org.Myweb.messageBodyWriters;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import org.Myweb.POJO.Currency;
import org.Myweb.POJO.name;

@Provider
@Produces(MediaType.TEXT_PLAIN)
public class MessageBodyWriterForCurrency implements MessageBodyWriter<Currency>{

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return Currency.class==type;
	}


	@Override
	public void writeTo(Currency t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		entityStream.write(t.toString().getBytes());
		
	}

}
