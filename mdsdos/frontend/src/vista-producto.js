import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 100%;">
  <img src="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs" id="imgProducto" style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout style="width: 100%; height: 100%;">
   <label id="productLbl" style="width: 80%;">Product name </label>
   <vaadin-button id="moreInfoBtn" style="width: 5%;">
     ... 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);
