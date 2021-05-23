import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class MyView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 49%; padding: var(--lumo-space-l); flex-shrink: 0; flex-grow: 1;">
  <label style="font-weight: bold; align-self: stretch;">Detalles del Pedido</label>
  <label style="align-self: stretch;">ID: 1234567890</label>
  <vaadin-text-field label="Comprador:" placeholder="Placeholder" readonly value="Nombre y Apellidos">
   Text
  </vaadin-text-field>
  <vaadin-text-field label="Direccion:" placeholder="Placeholder" readonly value="Dirección comprador" has-value>
    Text 
  </vaadin-text-field>
  <vaadin-date-picker label="Fecha del pedido:" placeholder="Pick a date" readonly value="2020/01/01"></vaadin-date-picker>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 49%; height: 100%; padding: var(--lumo-space-l); flex-grow: 1;">
  <vaadin-text-field label="Total:" value="1000 €" theme="align-right" style="align-self: flex-end;" has-value>
   <div slot="suffix">
     � 
   </div>
  </vaadin-text-field>
  <vaadin-text-area label="Detalle" placeholder="Add detailed explanation" style="width: 100%; height: 100%;" readonly></vaadin-text-area>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'my-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(MyView.is, MyView);
