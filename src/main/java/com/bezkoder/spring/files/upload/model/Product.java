package com.bezkoder.spring.files.upload.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long productId;
  private String categorie;
  private String url;
  private Long note;
  private Long vues;
  @Lob
  private byte[] data;
  private Boolean isFavorite=false;

  public Product(Long productId, String categorie, String url, Long note, Long vues, byte[] data, Boolean isFavorite) {
    this.productId = productId;
    this.categorie = categorie;
    this.url = url;
    this.note = note;
    this.vues = vues;
    this.data = data;
    this.isFavorite = isFavorite;
  }

  public Boolean getFavorite() {
    return isFavorite;
  }

  public void setFavorite(Boolean favorite) {
    isFavorite = favorite;
  }

  public Product() {
  }

  public Long getNote() {
    return note;
  }

  public void setNote(Long note) {
    this.note = note;
  }

  public Long getVues() {
    return vues;
  }

  public void setVues(Long vues) {
    this.vues = vues;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public String getCategorie() {
    return categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Product{" +
            "productId=" + productId +
            ", categorie='" + categorie + '\'' +
            ", note=" + note +
            ", vues=" + vues +
            ", data=" + Arrays.toString(data) +
            '}';
  }
}