import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaComentarproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout style="width: 70%; height: 70%; align-self: center; justify-content: center;" theme="spacing">
  <label id="nombreProductoLbl" style="width: 80%; align-self: center;">Nombre producto </label>
  <vaadin-horizontal-layout style="width: 80%; align-self: center;">
   <label style="width: 90%;">Nota Valoracion</label>
   <input type="text" id="valoracionInput" style="width: 5%;">
   <label style="width: 5%;">/5</label>
  </vaadin-horizontal-layout>
  <label style="width: 80%; align-self: center;">Escriba comentario:</label>
  <vaadin-text-area id="comentarioTxt" style="width: 80%; align-self: center;"></vaadin-text-area>
  <vaadin-horizontal-layout style="width: 80%; align-self: center; justify-content: space-between;">
   <vaadin-button id="aceptarBtn" style="width: 25%;">
     Aceptar 
   </vaadin-button>
   <vaadin-button id="cancelarBtn" style="width: 25%;">
     Cancelar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-comentarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComentarproducto.is, VistaComentarproducto);
