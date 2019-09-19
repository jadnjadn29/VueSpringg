<template>
  <div  align='center'>
    <h1>ระบบสั่งยา</h1>
    <div align='center' class="md-layout md-gutter">
      <div class="md-layout-item">
        <md-field>
          <label for="patient">ชื่อผู้ป่วย</label>
          <md-select v-model="patient" name="patient" id="patient" placeholder="ชื่อผู้ป่วย">
            <md-option value="fight-club">Fight Club</md-option>
            <md-option value="godfather">Godfather</md-option>
            <md-option value="godfather-ii">Godfather II</md-option>
            <md-option value="godfather-iii">Godfather III</md-option>
            <md-option value="godfellas">Godfellas</md-option>
            <md-option value="pulp-fiction">Pulp Fiction</md-option>
            <md-option value="scarface">Scarface</md-option>
          </md-select>
        </md-field>
      </div>
    </div>
    <div align='center' class="md-layout-item">
      <md-field>
        <label for="doctor">ชื่อแพทย์</label>
        <md-select v-model="doctor" name="doctor" id="doctor" placeholder="ชื่อแพทย์">
          <md-option value="australia">Australia</md-option>
          <md-option value="brazil">Brazil</md-option>
          <md-option value="japan">Japan</md-option>
          <md-option value="united-states">United States</md-option>
        </md-select>
      </md-field>
    </div>
    <div  align='center'>
      <md-field>
      <label>อาการ</label>
      <md-textarea v-model="textarea"></md-textarea>
    </md-field>
    </div>
   <div class="md-layout-item">
      <md-field>
        <label for="medicine">ยา</label>
        <md-select v-model="medicine" name="medicine" id="medicine" multiple>
          <md-option value="fight-club">Fight Club</md-option>
          <md-option value="godfather">Godfather</md-option>
          <md-option value="godfather-ii">Godfather II</md-option>
          <md-option value="godfather-iii">Godfather III</md-option>
          <md-option value="godfellas">Godfellas</md-option>
          <md-option value="pulp-fiction">Pulp Fiction</md-option>
          <md-option value="scarface">Scarface</md-option>
        </md-select>
      </md-field>

     
    </div>
 
    <div  align='center'>
      <md-field>
      <label>จำนวน</label>
      <md-textarea v-model="textarea"></md-textarea>
    </md-field>
    </div>
    

      <md-button class="md-raised md-primary">SAVE</md-button>
      <md-button class="md-raised md-accent">CANCEL</md-button>
    </div>
</template>

<script>
export default {
  name: "BasicSelect",
  data: () => ({
    movie: "godfather",
    country: null,
    font: null
  })
};
</script>

<script>
export default {
  name: "BasicSelect",
  data: () => ({
    movie: "godfather",
    country: null,
    font: null
  })
};
</script>


<style scoped>
h1 {
text-align: center;
font-size: x-large;
}
.md-field {
max-width: 400px;

}


</style>
