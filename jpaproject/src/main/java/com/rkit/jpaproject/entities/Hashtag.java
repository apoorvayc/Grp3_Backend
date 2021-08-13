package com.rkit.jpaproject.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Hashtag {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		int id;
		int rating;
		String hashtagname;
		int count;
		
		@Override
		public String toString() {
			return "User [id=" + id + ", rating=" + rating + ", hashtagname=" + hashtagname + ", count=" +count + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public String getHashtagname() {
			return hashtagname;
		}

		public void setHashtagname(String hashtagname) {
			this.hashtagname = hashtagname;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		
	}

